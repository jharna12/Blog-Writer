package repository;
import model.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
}
