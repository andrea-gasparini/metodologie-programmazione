/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class DefinitionAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("DEFINITION_ANNOTATION", "Provide a definition in your Mother Tongue of this word and his hypernym", ["Word", "Hypernym"], "./definitionAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(0), this.createInputHiddenElem(1));
                    }
                    static main(args) {
                        new DefinitionAnnotation();
                    }
                }
                task.DefinitionAnnotation = DefinitionAnnotation;
                DefinitionAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.DefinitionAnnotation";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.task.DefinitionAnnotation.main(null);
