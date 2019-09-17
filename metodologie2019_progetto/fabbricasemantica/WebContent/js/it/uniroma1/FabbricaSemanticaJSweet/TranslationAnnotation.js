/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            class TranslationAnnotation extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                constructor(pageName) {
                    super(pageName);
                    $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
                    $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(3).addText("Provide a translation in your Mother Tongue").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("first-div").addClass("bold-text").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("second-div").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form").changeMethod("POST").addAction("./translationAnnotation.jsp").build());
                    $("#first-div").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addText("Word:").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("word").addClass("grey-text").build());
                    $("#second-div").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("bold-text").addText("Definition:").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder("definition").addClass("grey-text").build());
                    $("#form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").isRequired().addName("translation").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("next").addType("submit").addValue("NEXT").addName("next").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("second-button").changeMethod("POST").addAction("./nextTask.jsp").build());
                    $("#second-button").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("skip").addType("submit").addValue("SKIP").addName("skip"));
                }
                static main(args) {
                    new TranslationAnnotation(it.uniroma1.FabbricaSemanticaJSweet.PageType.ANNOTATION_OR_VALIDATION_PAGE);
                }
            }
            FabbricaSemanticaJSweet.TranslationAnnotation = TranslationAnnotation;
            TranslationAnnotation["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.TranslationAnnotation";
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
it.uniroma1.FabbricaSemanticaJSweet.TranslationAnnotation.main(null);
