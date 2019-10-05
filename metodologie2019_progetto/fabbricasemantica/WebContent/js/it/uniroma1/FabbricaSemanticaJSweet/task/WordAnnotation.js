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
                 * Costruisce la pagina WordAnnotation con l'elemento di contesto Definition.
                 * Viene chiamato il metodo per creare i Task di base. Al form viene aggiunto
                 * l'elemento nascosto per registrare nella base di dati anche il contesto del
                 * task oltre che la risposta.
                 * @class
                 * @extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage
                 * @author Andrea Gasparini (1813486)
                 */
                class WordAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage {
                    constructor() {
                        super("WORD_ANNOTATION", "Try to guess the right term for the definition", ["Definition"], "./wordAnnotation.jsp");
                        this.createBasicTask();
                        $("#form-1").append(this.createInputHiddenElem(this.contextElems[0]));
                    }
                    /**
                     * Crea la pagina WordAnnotation
                     * @param {Array} args
                     */
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
