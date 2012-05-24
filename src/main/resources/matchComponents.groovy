				for(jiraComp in message.getInvocationProperty('jiraComponents')){
					if(jiraComp.getName().minus(" connector").toLowerCase().equals(message.getInvocationProperty('gitRepoName').minus("-connector").toLowerCase())){
						message.setInvocationProperty('componentId', jiraComp.getId()) 
						message.setInvocationProperty('componentName', jiraComp.getName())
						break
					}else{
						message.setInvocationProperty('componentId', message.getInvocationProperty('defaultRepoId'))
						message.setInvocationProperty('componentName', message.getInvocationProperty('defaultRepoName'))
					}
				}
				return originalPayload