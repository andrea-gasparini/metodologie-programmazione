/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
class ExamplePage {
    static main(args) {
        console.log("Creating form");
        let form = document.createElement("form");
        form.action = ExamplePage.SERVLET_URL;
        form.method = "POST";
        console.log("Form Done");
        console.log("creating desct");
        let description = document.createElement("label");
        description.className = "form-control-plaintext";
        description.setAttribute("style", "font-weight:bold");
        console.log("creating word");
        let word = document.createElement("label");
        word.className = "form-control-plaintext";
        console.log("creating translation");
        let translation = document.createElement("textarea");
        translation.name = "translation";
        translation.className = "form-control";
        translation.placeholder = "Scrivi la traduzione qui...";
        let submit = document.createElement("input");
        submit.type = "submit";
        submit.name = "submit_button";
        submit.className = "btn btn-primary";
        submit.value = "Avanti";
        let skip = document.createElement("input");
        skip.type = "submit";
        skip.name = "skip_button";
        skip.className = "btn btn-primary";
        skip.value = "Skip";
        $(skip).css("float", "right");
        $.getJSON(ExamplePage.REST_URL, "task=TRANSLATION_ANNOTATION", ((description, word) => {
            return (result, a, ctx) => {
                let json = result;
                let sWord = (json["word"]);
                let sDescription = (json["description"]);
                $(word).text(sWord);
                $(description).text(sDescription);
                return null;
            };
        })(description, word));
        let divWord = document.createElement("div");
        divWord.className = "form-group";
        $(divWord).append(word);
        let divDescription = document.createElement("div");
        divDescription.className = "form-group";
        $(divDescription).append(description);
        let divTranslation = document.createElement("div");
        divTranslation.className = "form-group";
        let label = document.createElement("label");
        label.textContent = "Traduzione:";
        $(divTranslation).append(label);
        $(divTranslation).append(translation);
        let divButtons = document.createElement("div");
        divButtons.className = "form-group";
        $(divButtons).append(submit, skip);
        $(form).css("margin", "0% 1.5%");
        console.log("adding to form");
        $(form).append(divWord);
        $(form).append(divDescription);
        $(form).append(divTranslation);
        $(form).append(divButtons);
        console.log("adding to body");
        $("body").append(form);
    }
}
ExamplePage.SERVLET_URL = "example.jsp";
ExamplePage.REST_URL = "nextExample.jsp";
ExamplePage["__class"] = "ExamplePage";
ExamplePage.main(null);
