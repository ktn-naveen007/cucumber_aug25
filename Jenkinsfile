node('master'){
stage('initialize'){
 checkout scm
}
stage('compile'){
bat '''
mvn compile
'''
}
stage('unittest'){
bat '''
mvn test
'''
}
stage('reports'){
cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'E:\\Girish-Cucumber\\BDD_using_Selenium_Cucumber\\BDD_using_Selenium_Cucumbertarget\\cucumber-reports', sortingMethod: 'ALPHABETICAL'
}
}