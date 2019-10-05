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
                 * Costruisce la pagina SenseAnnotation con gli elementi di contesto Word e
                 * Definition. Viene chiamato il metodo per creare i Task di base. Al form
                 * vengono aggiunti gli elementi nascosti per registrare nella base di dati
                 * anche il contesto del task oltre che la risposta.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class TranslationAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("TRANSLATION_ANNOTATION", "Provide a translation in your Mother Tongue", ["Word", "Definition"], "./translationAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem(this.contextElems[1]));
                    }
                    /**
                     * Crea la pagina TranslationAnnotation
                     * @param {Array} args
                     */
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
