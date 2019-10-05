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
                 * Costruisce la pagina DefinitionAnnotation con gli elementi di contesto Word e
                 * Hypernym. Viene chiamato il metodo per creare i Task di base. Al form vengono
                 * aggiunti gli elementi nascosti per registrare nella base di dati anche il
                 * contesto del task oltre che la risposta.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class DefinitionAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("DEFINITION_ANNOTATION", "Provide a definition in your Mother Tongue of this word and his hypernym", ["Word", "Hypernym"], "./definitionAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(this.contextElems[0]), this.createInputHiddenElem(this.contextElems[1]));
                    }
                    /**
                     * Crea la pagina DefinitionAnnotation
                     * @param {Array} args
                     */
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
