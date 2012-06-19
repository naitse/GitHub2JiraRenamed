def jiraIssueResolution = Integer.parseInt(message.getSessionProperty('jiraIssueResolution'));			
def theCommentBody = null;
			
			switch(jiraIssueResolution){
			case 1:
				theCommentBody = "The fix will be available in the nex beta release, Thank you.";
				break;
			case 2:
				theCommentBody = "Won't Fix, Thank you.";
				break;
			case 3:
				theCommentBody = "Marking as Duplicate, Thank you.";
				break;
			case 4:
				theCommentBody = "The bug description is incomplete, please add more details, Thank You.";
				break;
			case 5:
				theCommentBody = "Unable to reproduce, Thank You.";
				break;
			}

return theCommentBody;