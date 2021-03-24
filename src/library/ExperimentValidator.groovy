package library

class ExperimentValidator {

    String validateExperiments() {
        println("Validatin experiments - class - v1")
        //return "Validatin experiments - class - v1"
    }
    
    int sum(int a, int b) {
        return a + b
    }

    String getDiff() {


        def sout = new StringBuilder(), serr = new StringBuilder()
        //arc export --revision D335558 --unified
        //arc export --revision D688426 --unified
        //arc export --revision D691559 --unified

        def proc = """
                arc export --revision D695602 --unified
               """.execute()

        proc.consumeProcessOutput(sout, serr)
        proc.waitForOrKill(5000)
        return sout
        println "out> $sout\nerr> $serr"


        /*diff = sh (
                script: """
                        arc export --revision D335558 --unified
                        """,
                returnStdout: true
        ).trim()
        return diff
        */
    }

}
