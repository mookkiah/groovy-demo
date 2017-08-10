package intro

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7')
@Grab('oauth.signpost:signpost-core:1.2.1.2')
@Grab('oauth.signpost:signpost-commonshttp4:1.2.1.2')


import groovyx.net.http.RESTClient

//-Dgroovy.grape.report.downloads=true to see the downloads
def endPoint = new RESTClient("http://jsonplaceholder.typicode.com/")
def response = endPoint.get(path: "todos")
println response.status
println response.headers.each {println it}
println'-----------------------------------'
response.data.each{println "$it.title --> $it.completed"}