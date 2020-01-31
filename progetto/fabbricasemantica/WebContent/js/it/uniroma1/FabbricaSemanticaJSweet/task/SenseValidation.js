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
                 * Costruisce la pagina SenseValidation con gli elementi di contesto Word,
                 * Sentence e Definition. Al form vengono aggiunti una scelta fra Yes e No, gli
                 * elementi nascosti relativi al contesto e i pulsanti per inviare o saltare il
                 * Task. Viene chiamato il metodo per recuperare i dati del Task dal back-end.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class SenseValidation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("SENSE_VALIDATION", "Is the word in the following sentence the right term for this definition?", ["Word", "Sentence", "Definition"], "./senseValidation.jsp");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction(this.servletUrl).build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("radio-div").addClass("horizontal container grey-text align-center").build(), this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem(this.contextElems[1]), this.createInputHiddenElem(this.contextElems[2]), this.createBottomButtons("buttons-div", "align-center"));
                        $("#radio-div").append(this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String("Yes", "Yes", "response", "space-between"), this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String("No", "No", "response", "space-between"));
                        $(".radio-div").css("height", "33px");
                        this.fillTaskContext();
                    }
                    /**
                     * Crea la pagina SenseValidation
                     * @param {Array} args
                     */
                    static main(args) {
                        new SenseValidation();
                    }
                }
                task.SenseValidation = SenseValidation;
                SenseValidation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.SenseValidation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.SenseValidation.main(null);
