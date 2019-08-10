package core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import core.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	//To do queries against H2 DB.
}
