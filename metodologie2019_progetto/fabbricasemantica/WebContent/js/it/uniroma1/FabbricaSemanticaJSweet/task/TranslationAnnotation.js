/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class TranslationAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("TRANSLATION_ANNOTATION", "Provide a translation in your Mother Tongue", ["Word", "Definition"], "./translationAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(0), this.createInputHiddenElem(1));
                    }
                    static main(args) {
                        new TranslationAnnotation();
                    }
                }
                task.TranslationAnnotation = TranslationAnnotation;
                TranslationAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.TranslationAnnotation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.TranslationAnnotation.main(null);
