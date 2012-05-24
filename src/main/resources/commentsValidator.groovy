	                    if (message.getInvocationProperty('jiraIssueComments').size() != 0){
	                    	for(jiraComment in message.getInvocationProperty('jiraIssueComments')){
	                    		if(jiraComment.body.contains('| Commenter:') && jiraComment.body.split(' | ')[0].toLong().equals(payload.id)){
	                    			message.setInvocationProperty('commentExists', 'YES')
	                    			break
	                    		}else{
	                    			message.setInvocationProperty('commentExists', "")
	                    		}
	                    	}
	                    }else {
	                              	message.setInvocationProperty('commentExists', "")
	                    }
							return src