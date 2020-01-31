/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                /**
                 * Costruisce la pagina MyAnnotation con l'elemento di contesto Word e un
                 * ulteriore titolo oltre quello esplicativo del Task. Aggiunge l'immagine
                 * dell'impiccato, l'elemento che rappresenta la parola da indovinare, una
                 * tastiera HTML e il form in cui son contenuti gli elementi nascosti con la
                 * parola fornita dal sistema, il sinonimo da indovinare e l'esito del gioco,
                 * oltre ai pulsanti per inviare o saltare il Task. Il pulsante per l'invio del
                 * form viene disabilitato fino a che non si indovina il sinonimo o si terminano
                 * i tentativi disponibili.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class MyAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("MY_ANNOTATION", "Try to guess the right synonym of this word and save the stickman", ["Word"], "./myAnnotation.jsp");
                        /**
                         * Possibilita' di interagire con il Task
                         */
                        /*private*/ this.canPlay = true;
                        /**
                         * Lista delle lettere gia' selezionate nel gioco
                         */
                        /*private*/ this.usedLetters = ([]);
                        /**
                         * Lista dei caratteri "oscurati" del sinonimo da indovinare
                         */
                        /*private*/ this.mask = ([]);
                        /**
                         * Numero di lettere scelte non presenti nel sinonimo (quindi scelte sbagliate)
                         */
                        /*private*/ this.wrongGuesses = 0;
                        if (this.synonym === undefined)
                            this.synonym = null;
                        $(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(2).addText("The synonyms hangman").build()).insertBefore("h3");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLImageElementBuilder("Hangman").addSrc("./images/hmstart.gif").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("final-word").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("keyboard").addClass("vertical container").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").addClass("vertical container width-90").addAction(this.servletUrl).build());
                        $("#keyboard").append(this.createKeyboardRow$int$int(0, 10), this.createKeyboardRow$int$int(10, 19), this.createKeyboardRow$int(19));
                        $("#form").append(this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem("synonym"), this.createInputHiddenElem("result"), this.createBottomButtons("bottom-buttons", "space-between"));
                        $("#next-button").prop("disabled", this.canPlay + "");
                        this.fillTaskContext();
                        this.synonym = $("#synonym-hidden").val().toUpperCase();
                        this.createMask();
                    }
                    static ALPHABET_$LI$() { if (MyAnnotation.ALPHABET == null)
                        MyAnnotation.ALPHABET = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']; return MyAnnotation.ALPHABET; }
                    ;
                    /**
                     * Crea la pagina MyAnnotation
                     * @param {Array} args
                     */
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
                    /**
                     * Crea un elemento HTML contenente una riga della tastiera HTML contenente le
                     * lettere dell'alfabeto ed associa ad ogni "pulsante" l'azione di selezionare
                     * la lettera
                     *
                     * @param {number} firstIndex indice della prima lettera da inserire nella riga
                     * @param {number} lastIndex  indice dell'ultima lettera da inserire nella riga
                     * @return {HTMLDivElement} ritorna l'elemento HTML contenente la riga della tastiera
                     * @private
                     */
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
                    /**
                     * Aggiunge alla lista dei caratteri "oscurati" tanti underscore quante sono le
                     * lettere del sinonimo da indovinare
                     * @private
                     */
                    /*private*/ createMask() {
                        for (let i = 0; i < this.synonym.length; i++) {
                            (this.mask.push((c => c.charCodeAt == null ? c : c.charCodeAt(0))(this.synonym.charAt(i)) == ' '.charCodeAt(0) ? ' ' : '_') > 0);
                        }
                        this.saveMask();
                    }
                    /**
                     * Modifica i caratteri della lista degli "oscurati" impostando la nuova lettera
                     * nelle posizioni indicate
                     *
                     * @param {string} letter lettera da impostare nella maschera
                     * @param {number[]} letterIndexes indici in cui impostare la lettera
                     * @private
                     */
                    /*private*/ editMask(letter, letterIndexes) {
                        for (let index121 = 0; index121 < letterIndexes.length; index121++) {
                            let i = letterIndexes[index121];
                            /* set */ (this.mask[i] = letter);
                        }
                        this.saveMask();
                    }
                    /**
                     * Crea una Stringa concatenando i caratteri presenti nella lista dei caratteri
                     * "oscurati" e la imposta nella pagina al posto della precedente
                     * @private
                     */
                    /*private*/ saveMask() {
                        let maskString = "";
                        for (let i = 0; i < this.mask.length; i++) {
                            maskString += i === this.synonym.length - 1 ? this.mask[i] : this.mask[i] + " ";
                        }
                        $("#final-word").text(maskString);
                    }
                    /**
                     * Dopo aver controllato se e' ancora possibile giocare e se la lettera passata
                     * come parametro e' stata gia' selezionata (in caso contrario la aggiunge a
                     * quelle utilizzate), controlla se questa e' presente nel sinonimo e in caso
                     * positivo modifica la maschera dei caratteri "oscurati" e controlla se il
                     * gioco e' terminato con una vittoria (se non ci sono piu' caratteri oscurati
                     * nella lista). In caso negativo incrementa il numero di tentativi e aggiorna
                     * l'immagine dell'impiccato, se i tentativi sono pari a 6 il gioco termina con
                     * la perdita.
                     *
                     * @param {string} letter lettera selezionata
                     * @return {boolean} false se non e' stato possibile selezionarla, true altrimenti
                     * @private
                     */
                    /*private*/ selectLetter(letter) {
                        if ((!this.canPlay) || (this.usedLetters.indexOf((letter)) >= 0))
                            return false;
                        /* add */ (this.usedLetters.push(letter) > 0);
                        if (this.synonym.indexOf(letter) !== -1) {
                            $("#" + letter).css("border-color", "green").css("color", "green");
                            this.editMask(letter, this.occurrencesPositions(letter));
                            if (!($("#final-word").text().indexOf("_") != -1))
                                this.endGame(true);
                        }
                        else {
                            $("#" + letter).css("border-color", "red").css("color", "red");
                            this.wrongGuesses++;
                            $("#Hangman").attr("src", "images/hm" + this.wrongGuesses + ".gif");
                            if (this.wrongGuesses === 6)
                                this.endGame(false);
                        }
                        return true;
                    }
                    /**
                     * Data una lettera ritorna una Funzione dal click del mouse alla chiamata al
                     * metodo selectLetter della lettera stessa
                     *
                     * @param {string} letter lettera selezionata
                     * @return {*} Funzione da click del mouse al metodo di selezione lettera
                     * @private
                     */
                    /*private*/ selectLetterClick(letter) {
                        return (e) => this.selectLetter(letter);
                    }
                    /**
                     * Imposta l'esito della partita, termina il gioco e abilita l'utilizzo del
                     * pulsante di invio del form
                     *
                     * @param {boolean} outcome risultato della partita, true se vinta, false altrimenti
                     * @private
                     */
                    /*private*/ endGame(outcome) {
                        if (outcome)
                            $("#final-word").css("border-color", "green").css("color", "green");
                        else
                            $("#final-word").text("The stickman died :(").css("border-color", "red").css("color", "red");
                        $("#result-hidden").val(outcome ? "Win!" : "Lose :(");
                        this.canPlay = false;
                        $("#next-button").removeAttr("disabled");
                    }
                    /**
                     * Data una lettera, calcola gli indici delle occorrenze del carattere nel
                     * sinonimo
                     *
                     * @param {string} letter lettera di cui cercare gli indici
                     * @return {number[]} lista degli indici in cui si trova la lettera (all'interno del sinonimo)
                     * @private
                     */
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
