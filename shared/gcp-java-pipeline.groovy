def call(Map pipelineParams) {
	pipeline {
		agent {
			kubernetes {
				label pipelineParams.get('name')
				yaml getKubeYaml(pipelineParams.get('containerType', 'java11'))
			}
	}
}
