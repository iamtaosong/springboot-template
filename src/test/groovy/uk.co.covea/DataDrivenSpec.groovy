

import spock.lang.*

@Unroll
class DataDrivenSpec extends Specification {


    def "#person.name is a #sex.toLowerCase() person"() {
        expect:
            person.getSex() == sex

        where:
            person                    || sex
            new Person(name: "Fred")  || "Male"
            new Person(name: "Wilma") || "Female"
    }

    static class Person {
        String name
        String getSex() {
            name == "Fred" ? "Male" : "Female"
        }
    }


    def testPassword(){




    }
}