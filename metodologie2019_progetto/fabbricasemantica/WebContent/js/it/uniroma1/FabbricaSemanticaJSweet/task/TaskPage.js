/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var it;
(function (it) {
    var uniroma1;
    (function (uniroma1) {
        var FabbricaSemanticaJSweet;
        (function (FabbricaSemanticaJSweet) {
            var task;
            (function (task) {
                class TaskPage extends it.uniroma1.FabbricaSemanticaJSweet.FabbricaSemanticaPage {
                    constructor(taskName, title, contextElems, servletUrl) {
                        super(it.uniroma1.FabbricaSemanticaJSweet.PageType.TASK_PAGE);
                        if (this.servletUrl === undefined)
                            this.servletUrl = null;
                        if (this.taskName === undefined)
                            this.taskName = null;
                        if (this.contextElems === undefined)
                            this.contextElems = null;
                        this.servletUrl = servletUrl;
                        this.taskName = taskName;
                        this.contextElems = contextElems;
                        $("#page").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("box").addClass("vertical container").build());
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLHeadingElementBuilder(3).addText(title).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("first-div").addClass("bold-text").build());
                        $("#first-div").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addText(contextElems[0] + ": ").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder(contextElems[0].toLowerCase()).addClass("grey-text").build());
                        for (let i = 1; i < contextElems.length; i++) {
                            {
                                let otherDiv = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("second-div").build();
                                $("#box").append(otherDiv);
                                $(otherDiv).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder().addClass("bold-text").addText(contextElems[i] + ": ").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder(contextElems[i].toLowerCase()).addClass("grey-text").build());
                            }
                            ;
                        }
                    }
                    createBasicTask() {
                        $("#box").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder("div-form").addClass("horizontal container").build());
                        $("#div-form").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLFormElementBuilder("form-1").addClass("horizontal container width-90").changeMethod("POST").addAction(this.servletUrl).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("button-2").addHref(this.servletUrl).build());
                        $("#form-1").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().addClass("form-field").isRequired().addName("response").build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder("fixd-margin-top").addType("submit").addName("submit").addValue("NEXT").build());
                        $("#button-2").append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addText("SKIP").build());
                        this.fillTaskContext();
                    }
                    createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String(id, text, name, justifyContent) {
                        let elem = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder().addClass("horizontal container radio-div " + justifyContent).build();
                        $(elem).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder(id + "-radio").isRequired().addType("radio").addName(name).addValue(text).build(), new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLSpanElementBuilder(id).addClass("form-text").addText(text).build());
                        return elem;
                    }
                    createRadioResponse(id, text, name, justifyContent) {
                        if (((typeof id === 'string') || id === null) && ((typeof text === 'string') || text === null) && ((typeof name === 'string') || name === null) && ((typeof justifyContent === 'string') || justifyContent === null)) {
                            return this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String(id, text, name, justifyContent);
                        }
                        else if (((typeof id === 'string') || id === null) && ((typeof text === 'string') || text === null) && ((typeof name === 'string') || name === null) && justifyContent === undefined) {
                            return this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String(id, text, name);
                        }
                        else if (((typeof id === 'string') || id === null) && ((typeof text === 'string') || text === null) && name === undefined && justifyContent === undefined) {
                            return this.createRadioResponse$java_lang_String$java_lang_String(id, text);
                        }
                        else
                            throw new Error('invalid overload');
                    }
                    createRadioResponse$java_lang_String$java_lang_String$java_lang_String(id, text, name) {
                        return this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String(id, text, name, "");
                    }
                    createRadioResponse$java_lang_String$java_lang_String(id, name) {
                        return this.createRadioResponse$java_lang_String$java_lang_String$java_lang_String$java_lang_String(id, "", name, "");
                    }
                    createBottomButtons(divId, justifyContent) {
                        let elem = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLDivElementBuilder(divId).addClass("horizontal container " + justifyContent).build();
                        let secondButton = new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLAnchorElementBuilder("skip-button").addHref(this.servletUrl).build();
                        $(elem).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder().isRequired().addType("submit").addName("submit").addValue("NEXT").build(), secondButton);
                        $(secondButton).append(new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLButtonElementBuilder("form-button").addName("submit").addValue("SKIP").addType("button").addText("SKIP").build());
                        return elem;
                    }
                    createInputHiddenElem(contextElem) {
                        return new it.uniroma1.FabbricaSemanticaJSweet.HTMLElementsBuilders.HTMLInputElementBuilder(contextElem.toLowerCase() + "-hidden").addName(contextElem.toLowerCase()).addType("hidden").build();
                    }
                    fillTaskContext$() {
                        $.getJSON(TaskPage.REST_URL, "task=" + this.taskName, (result, a, ctx) => {
                            let json = result;
                            for (let index121 = 0; index121 < this.contextElems.length; index121++) {
                                let elem = this.contextElems[index121];
                                {
                                    let text = (json[elem.toLowerCase()]);
                                    $("#" + elem.toLowerCase()).text(text);
                                    $("#" + elem.toLowerCase() + "-hidden").val(text);
                                }
                            }
                            return null;
                        });
                    }
                    fillTaskContext$java_lang_String$int(responsesName, nResponses) {
                        $.getJSON(TaskPage.REST_URL, "task=" + this.taskName, (result, a, ctx) => {
                            let json = result;
                            for (let index122 = 0; index122 < this.contextElems.length; index122++) {
                                let elem = this.contextElems[index122];
                                {
                                    let text = (json[elem.toLowerCase()]);
                                    $("#" + elem.toLowerCase()).text(text);
                                    $("#" + elem.toLowerCase() + "-hidden").val(text);
                                }
                            }
                            let senses = (json[responsesName]);
                            for (let i = 1; i <= nResponses; i++) {
                                {
                                    $("#response-" + i).text(senses[i - 1]);
                                    $("#response-" + i + "-radio").val(senses[i - 1]);
                                }
                                ;
                            }
                            return null;
                        });
                    }
                    fillTaskContext(responsesName, nResponses) {
                        if (((typeof responsesName === 'string') || responsesName === null) && ((typeof nResponses === 'number') || nResponses === null)) {
                            return this.fillTaskContext$java_lang_String$int(responsesName, nResponses);
                        }
                        else if (responsesName === undefined && nResponses === undefined) {
                            return this.fillTaskContext$();
                        }
                        else
                            throw new Error('invalid overload');
                    }
                }
                TaskPage.REST_URL = "./nextExample.jsp";
                task.TaskPage = TaskPage;
                TaskPage["__class"] = "it.uniroma1.FabbricaSemanticaJSweet.task.TaskPage";
            })(task = FabbricaSemanticaJSweet.task || (FabbricaSemanticaJSweet.task = {}));
        })(FabbricaSemanticaJSweet = uniroma1.FabbricaSemanticaJSweet || (uniroma1.FabbricaSemanticaJSweet = {}));
    })(uniroma1 = it.uniroma1 || (it.uniroma1 = {}));
})(it || (it = {}));
