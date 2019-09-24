/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class SenseAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("SENSE_ANNOTATION", "Select the correct meaning of the word in the following sentence", ["Word", "Sentence"], "./senseAnnotation.jsp");
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction(this.servletUrl).build());
                        $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("form-div").addClass("vertical container grey-text").build(), this.createBottomButtons("bottom-buttons", "space-between"));
                        $("#form-div").append(this.createRadioResponse$java_lang_String$java_lang_String("test1", "sentence"), this.createRadioResponse$java_lang_String$java_lang_String("test2", "sentence"), this.createRadioResponse$java_lang_String$java_lang_String("test3", "sentence"), this.createRadioResponse$java_lang_String$java_lang_String("test4", "sentence"));
                        this.fillTaskContext();
                    }
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
