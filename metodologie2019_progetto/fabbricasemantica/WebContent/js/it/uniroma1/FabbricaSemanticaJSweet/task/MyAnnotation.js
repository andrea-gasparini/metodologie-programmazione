/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class MyAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("MY_ANNOTATION", "Try to guess the right synonym of this word and save the stickman", ["Word"], "./myAnnotation.jsp");
                        /*private*/ this.canPlay = true;
                        /*private*/ this.usedLetters = ([]);
                        /*private*/ this.mask = ([]);
                        /*private*/ this.wrongGuesses = 0;
                        if (this.synonym === undefined)
                            this.synonym = null;
                        $(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2).addText("The synonyms hangman").build()).insertBefore("h3");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder("Hangman").addSrc("./images/hmstart.gif").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("final-word").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("keyboard").addClass("vertical container").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container width-90").addAction(this.servletUrl).build());
                        $("#keyboard").append(this.createKeyboardRow$int$int(0, 10), this.createKeyboardRow$int$int(10, 19), this.createKeyboardRow$int(19));
                        $("#form").append(this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem("synonym"), this.createInputHiddenElem("result", "uncompleted game"), this.createBottomButtons("bottom-buttons", "space-between"));
                        this.fillTaskContext();
                        this.synonym = $("#synonym-hidden").val().toUpperCase();
                        this.createMask();
                    }
                    static ALPHABET_$LI$() { if (MyAnnotation.ALPHABET == null)
                        MyAnnotation.ALPHABET = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']; return MyAnnotation.ALPHABET; }
                    ;
                    static main(args) {
                        new MyAnnotation();
                    }
                    createKeyboardRow$int$int(firstIndex, lastIndex) {
                        let row = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("horizontal container align-center").build();
                        for (let i = firstIndex; i < lastIndex; i++) {
                            $(row).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder(MyAnnotation.ALPHABET_$LI$()[i].toString()).onClick((this.selectLetterClick(MyAnnotation.ALPHABET_$LI$()[i]))).addClass("letter").addText(MyAnnotation.ALPHABET_$LI$()[i].toString()).build());
                        }
                        return row;
                    }
                    createKeyboardRow(firstIndex, lastIndex) {
                        if (((typeof firstIndex === 'number') || firstIndex === null) && ((typeof lastIndex === 'number') || lastIndex === null)) {
                            return this.createKeyboardRow$int$int(firstIndex, lastIndex);
                        }
                        else if (((typeof firstIndex === 'number') || firstIndex === null) && lastIndex === undefined) {
                            return this.createKeyboardRow$int(firstIndex);
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    /*private*/ createKeyboardRow$int(firstIndex) {
                        return this.createKeyboardRow$int$int(firstIndex, MyAnnotation.ALPHABET_$LI$().length);
                    }
                    fillTaskContext(responsesName, nResponses) {
                        if (((typeof responsesName === 'string') || responsesName === null) && ((typeof nResponses === 'number') || nResponses === null)) {
                            super.fillTaskContext(responsesName, nResponses);
                        }
                        else if (responsesName === undefined && nResponses === undefined) {
                            return this.fillTaskContext$();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    fillTaskContext$() {
                        $.ajax(Object.defineProperty({
                            url: it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage.REST_URL,
                            dataType: "json",
                            data: "task=" + this.taskName,
                            async: false,
                            success: (result, a, ctx) => {
                                let json = result;
                                let text = (json[this.contextElems[0].toLowerCase()]);
                                $("#" + this.contextElems[0].toLowerCase()).text(text);
                                $("#" + this.contextElems[0].toLowerCase() + "-hidden").val(text);
                                $("#synonym-hidden").val((json["synonym"]));
                                return null;
                            }
                        }, '__interfaces', { configurable: true, value: ["def.jquery.JQueryAjaxSettings"] }));
                    }
                    /*private*/ createMask() {
                        for (let i = 0; i < this.synonym.length; i++) {
                            (this.mask.push('_') > 0);
                        }
                        this.saveMask();
                    }
                    /*private*/ editMask(letter, letterIndexes) {
                        for (let index121 = 0; index121 < letterIndexes.length; index121++) {
                            let i = letterIndexes[index121];
                            /* set */ (this.mask[i] = letter);
                        }
                        this.saveMask();
                    }
                    /*private*/ saveMask() {
                        let maskString = "";
                        for (let i = 0; i < this.mask.length; i++) {
                            maskString += i === this.synonym.length - 1 ? this.mask[i] : this.mask[i] + " ";
                        }
                        $("#final-word").text(maskString);
                    }
                    /*private*/ selectLetter(letter) {
                        if ((!this.canPlay) || (this.usedLetters.indexOf((letter)) >= 0))
                            return false;
                        /* add */ (this.usedLetters.push(letter) > 0);
                        if (this.synonym.indexOf(letter) !== -1) {
                            $("#" + letter).css("border-color", "green").css("color", "green");
                            this.editMask(letter, this.occurrencesPositions(letter));
                            if (!($("#final-word").text().indexOf("_") != -1)) {
                                $("#final-word").css("border-color", "green").css("color", "green");
                                $("#result-hidden").val("Win!");
                                this.canPlay = false;
                            }
                        }
                        else {
                            $("#" + letter).css("border-color", "red").css("color", "red");
                            this.wrongGuesses++;
                            $("#Hangman").attr("src", "images/hm" + this.wrongGuesses + ".gif");
                            if (this.wrongGuesses === 6) {
                                $("#final-word").text("The stickman died :(").css("border-color", "red").css("color", "red");
                                $("#result-hidden").val("Lose :(");
                                this.canPlay = false;
                            }
                        }
                        return true;
                    }
                    /*private*/ selectLetterClick(c) {
                        return (e) => this.selectLetter(c);
                    }
                    /*private*/ occurrencesPositions(letter) {
                        let letterIndexes = ([]);
                        for (let index = this.synonym.indexOf(letter); index >= 0; index = this.synonym.indexOf(letter, index + 1)) {
                            (letterIndexes.push(index) > 0);
                        }
                        return letterIndexes;
                    }
                }
                task.MyAnnotation = MyAnnotation;
                MyAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.MyAnnotation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.MyAnnotation.ALPHABET_$LI$();
it.uniroma1.FabbricaSemanticaJSweet.task.MyAnnotation.main(null);
