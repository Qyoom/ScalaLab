package combinatorial

object PermissionHierarchyLab1 {

  /********** MODEL **************/
  
  	object Role extends Enumeration {
	  	type Role = Value
    	val NON, VIEW, EDIT, ORG_ADMIN, Q_ADMIN = Value
  	}
  
  	case class UserPermission(
		endpoint: Option[String],
		projectId: Option[Int],
		role: Role.Value
  )
  
  /******** INSTANCES ***********/
  
  val p1 = UserPermission(Some("path.one"), Some(10), Role.EDIT)
                                                  //> p1  : combinatorial.PermissionHierarchyLab1.UserPermission = UserPermission(
                                                  //| Some(path.one),Some(10),EDIT)
  val p2 = UserPermission(Some("path.one"), Some(10), Role.VIEW)
                                                  //> p2  : combinatorial.PermissionHierarchyLab1.UserPermission = UserPermission(
                                                  //| Some(path.one),Some(10),VIEW)
  val p3 = UserPermission                         //> p3  : combinatorial.PermissionHierarchyLab1.UserPermission.type = UserPermis
                                                  //| sion
  /******** CONDITIONAL LOGIC *********/
  
  val candidate1 = p1                             //> candidate1  : combinatorial.PermissionHierarchyLab1.UserPermission = UserPer
                                                  //| mission(Some(path.one),Some(10),EDIT)
  val candidate2 = p2                             //> candidate2  : combinatorial.PermissionHierarchyLab1.UserPermission = UserPer
                                                  //| mission(Some(path.one),Some(10),VIEW)
  //................................//
  
 	if (candidate1.role > candidate2.role) {
 		true
 	}
 	else {
 		false
 	}                                         //> res0: Boolean = true
 	
  candidate1.projectId                            //> res1: Option[Int] = Some(10)
  
  candidate1.endpoint                             //> res2: Option[String] = Some(path.one)
  
    
}