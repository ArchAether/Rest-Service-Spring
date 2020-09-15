package Archaether.RestServiceSpring;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
/* This interface extends Spring Data JPA's repository, and
    specifies the domain type as Employee and the id type
    as Long.

    It supports 
    - Creating new instances
    - Updating existing ones
    - Deleting
    - Finding

    Spring Data's repository solution makes it possible to
    sidestep data store specifics and instead solve a majority
    of problems using domain-specific terminology
*/