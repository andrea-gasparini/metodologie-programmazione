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
                 * Sentence. Al form vengono aggiunte le risposte tra cui scegliere, gli
                 * elementi nascosti relativi al contesto e i pulsanti per inviare o saltare il
                 * Task. Viene chiamato il metodo per recuperare i dati del Task dal back-end.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class SenseAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("SENSE_ANNOTATION", "Select the correct meaning of the word in the following sentence", ["Word", "Sentence"], "./senseAnnotation.jsp");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction(this.servletUrl).build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(), this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem(this.contextElems[1]), this.createBottomButtons("bottom-buttons", "space-between"));
                        $("#form-div").append(this.createRadioResponse$java_lang_String$java_lang_String("response-1", "meaning"), this.createRadioResponse$java_lang_String$java_lang_String("response-2", "meaning"), this.createRadioResponse$java_lang_String$java_lang_String("response-3", "meaning"), this.createRadioResponse$java_lang_String$java_lang_String("response-4", "meaning"));
                        this.fillTaskContext$java_lang_String$int("senses", 4);
                    }
                    /**
                     * Crea la pagina SenseAnnotation
                     * @param {Array} args
                     */
                    static main(args) {
                        new SenseAnnotation();
                    }
                }
                task.SenseAnnotation = SenseAnnotation;
                SenseAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.SenseAnnotation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.SenseAnnotation.main(null);
