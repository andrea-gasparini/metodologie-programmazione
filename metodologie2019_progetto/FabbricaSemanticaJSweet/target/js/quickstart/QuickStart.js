/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
var quickstart;
(function (quickstart) {
    /**
     * This class is used within the webapp/index.html file.
     * @class
     */
    class QuickStart {
        static main(args) {
            let l = ([]);
            /* add */ (l.push("Hello") > 0);
            /* add */ (l.push("world") > 0);
            let a = (new Array());
            a.push("Hello", "world");
            $("#target").text(/* toString */ ('[' + l.join(', ') + ']'));
            alert(a.toString());
        }
    }
    quickstart.QuickStart = QuickStart;
    QuickStart["__class"] = "quickstart.QuickStart";
})(quickstart || (quickstart = {}));
quickstart.QuickStart.main(null);
