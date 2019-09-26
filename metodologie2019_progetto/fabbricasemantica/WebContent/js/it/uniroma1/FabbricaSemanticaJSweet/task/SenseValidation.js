/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class SenseValidation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("SENSE_VALIDATION", "Is the word in the following sentence the right term for this definition?", ["Word", "Sentence", "Definition"], "./senseValidation.jsp");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction(this.servletUrl).build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("radio-div").addClass("horizontal container grey-text align-center").build(), this.createInputHiddenElem(0), this.createInputHiddenElem(1), this.createInputHiddenElem(2), this.createBottomButtons("buttons-div", "align-center"));
                        $("#radio-div").append(this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String("Yes", "Yes", "response", "space-between"), this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String("No", "No", "response", "space-between"));
                        this.fillTaskContext();
                    }
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
