#!/usr/bin/env groovy

def checkJq(){

    jqResult = sh (script:
            """
            #!/usr/bin/env bash
            jq --version
            """, returnStdout: true)

    return jqResult
}

def call_func(){
    checkJq()
    echo "Hello"
}
