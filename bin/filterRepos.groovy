	def filteredGitRepos = []
	def gitRepoFilterPattern = message.getInvocationProperty('gitRepoFilterPattern')
	def gitExternalReposFlag = message.getInvocationProperty('gitExternalReposFlag')
	def gitExternalRepoCsv = message.getInvocationProperty('gitExternalRepoCsv')
	def gitExternalRepos;
	
	if (gitExternalRepoCsv != null){
		if(gitExternalRepoCsv.split(',')){
			gitExternalRepos = gitExternalRepoCsv.split(',')
		}else{
			gitExternalRepos = gitExternalRepoCsv
		}
	}
	
	for(github in payload){
		if(github.getName() =~ gitRepoFilterPattern){
			filteredGitRepos.add(github.getName())
		}
	}
	if (gitExternalReposFlag.toBoolean() && gitExternalRepos != null){
		for (externalRepoName in gitExternalRepos){
			filteredGitRepos.add(externalRepoName)
		}
	}
	return filteredGitRepos