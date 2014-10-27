package combinatorial

object PermissionsHierarchy {
	println("Equanimity is wisdom. Anger is a poison.")
  
  	object Role extends Enumeration {
	  	type Role = Value
    		val NON, VIEW, EDIT, ORG_ADMIN, Q_ADMIN = Value
  	}
  
  	class Permission(
		endpoint: String,
		projectId: Int,
		role: Role.Value
    )
}