#!/usr/bin/env groovy

def chekJq(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
 jqResult = sh (script:
            """
            #!/usr/bin/env bash
            jq
            """, returnStdout: true)
    return jqResult
}