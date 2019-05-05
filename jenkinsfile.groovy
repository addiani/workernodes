node ('linux'){
    stage("Hello"){
        sh "echo Hello"
    }
}

node ('linux'){
    stage("Hello from forth"){
        sh "echo Hello from second"
    }
}