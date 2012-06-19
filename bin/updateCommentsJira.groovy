	if(payload.body.contains('Commenter')){
		def pattern = '\\| Commenter'
		def body = payload.body.replaceAll(pattern,'GitHub_Commenter')
		//def body = "1231233 | Commenter: hola | Created: blabla \n este es el body de todos los issues"
		message.setInvocationProperty('jiraCommentNewBody', body)
	}
	return originalPayload