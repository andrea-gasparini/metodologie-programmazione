/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class WordAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("WORD_ANNOTATION", "Try to guess the right term for the definition", ["Definition"], "./wordAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(0));
                    }
                    static main(args) {
                        new WordAnnotation();
                    }
                }
                task.WordAnnotation = WordAnnotation;
                WordAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.WordAnnotation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.WordAnnotation.main(null);
