	def filteredGitRepos = []
	def gitRepoFilterPattern = message.getInvocationProperty('gitRepoFilterPattern')
	def gitExternalReposFlag = message.getInvocationProperty('gitExternalReposFlag')
	def gitExternalRepoCsv = message.getInvocationProperty('gitExternalRepoCsv')
	def gitExternalRepos = gitExternalRepoCsv.split(',')
	
	for(github in payload){
		if(github.getName() =~ gitRepoFilterPattern){
			filteredGitRepos.add(github.getName())
		}
	}
	if (gitExternalReposFlag.toBoolean()){
		for (externalRepoName in gitExternalRepos){
			filteredGitRepos.add(externalRepoName)
		}
	}
	return filteredGitRepos