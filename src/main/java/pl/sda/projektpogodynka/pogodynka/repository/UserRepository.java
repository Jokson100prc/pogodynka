package pl.sda.projektpogodynka.pogodynka.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.sda.projektpogodynka.pogodynka.objects.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
