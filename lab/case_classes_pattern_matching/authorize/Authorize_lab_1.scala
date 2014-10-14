package lab.case_classes_pattern_matching.authorize

object Authorize_lab_1 extends App {
    
	val rp1 = RequiredPermission(1L, Some(11L), "project/update", "ORG_ADMIN", None)
	val rp2 = RequiredPermission(2L, None, "project/delete", "ORG_ADMIN", None)
	val rp3 = RequiredPermission(2L, Some(12L), "project/delete", "VIEW", Some("lang=AR"))
	
	val perms = List(rp1, rp2, rp3)
		
	def authorize (rp: RequiredPermission) = rp match {
	    case RequiredPermission(id, Some(projectId), "project/update", "ORG_ADMIN", rule) => {
            if (projectId == 11) println("Got id: " + id)
	    }
	    case _ => println("Not what I'm looking for")
	}
	
	for (p <- perms) authorize(p)
}