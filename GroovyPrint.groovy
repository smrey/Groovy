class GroovyPrint {
    static void groovyPrint(String[] args) {
        println "Hello World"
        println args
        for (int i=0; i<args.length; i++){
            print args[i]
        }
    }
}