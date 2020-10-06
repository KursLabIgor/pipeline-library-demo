#!/usr/bin/env groovy

def chekJq(){

 jqResult = sh (script:
            """
            #!/usr/bin/env bash
            jq
            """, returnStdout: true)
    return jqResult
}