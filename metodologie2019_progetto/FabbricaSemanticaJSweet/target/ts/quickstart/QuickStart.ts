/* Generated from Java with JSweet 2.3.0-SNAPSHOT - http://www.jsweet.org */
namespace quickstart {
    /**
     * This class is used within the webapp/index.html file.
     * @class
     */
    export class QuickStart {
        public static main(args : string[]) {
            let l : Array<string> = <any>([]);
            /* add */(l.push("Hello")>0);
            /* add */(l.push("world")>0);
            let a : Array<string> = <any>(new Array<any>());
            a.push("Hello", "world");
            $("#target").text(/* toString */('['+l.join(', ')+']'));
            alert(a.toString());
        }
    }
    QuickStart["__class"] = "quickstart.QuickStart";

}


quickstart.QuickStart.main(null);
