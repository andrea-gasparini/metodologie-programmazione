/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class TranslationValidation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("TRANSLATION_VALIDATION", "Select the correct translation of this word and his definition", ["Word", "Definition"], "./translationValidation.jsp");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction(this.servletUrl).build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(), this.createBottomButtons("bottom-buttons", "space-between"));
                        $("#form-div").append(this.createRadioResponse$java_lang_String$java_lang_String("test1", "translation"), this.createRadioResponse$java_lang_String$java_lang_String("test2", "translation"), this.createRadioResponse$java_lang_String$java_lang_String("test3", "translation"), this.createRadioResponse$java_lang_String$java_lang_String("Nessuna", "translation"));
                        this.fillTaskContext();
                    }
                    static main(args) {
                        new TranslationValidation();
                    }
                    /**
                     *
                     */
                    fillTaskContext() {
                        $.getJSON(it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage.REST_URL, "task=" + this.taskName, (result, a, ctx) => {
                            let json = result;
                            for (let index122 = 0; index122 < this.contextElems.length; index122++) {
                                let elem = this.contextElems[index122];
                                {
                                    let response = (json[elem.toLowerCase()]);
                                    $("#" + elem.toLowerCase()).text(response);
                                }
                            }
                            return null;
                        });
                    }
                }
                task.TranslationValidation = TranslationValidation;
                TranslationValidation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.TranslationValidation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.TranslationValidation.main(null);
