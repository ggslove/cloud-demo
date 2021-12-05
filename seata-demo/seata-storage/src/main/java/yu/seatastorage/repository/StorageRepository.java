package yu.seatastorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yu.seatastorage.jpa.Storage;

public interface StorageRepository extends JpaRepository<Storage, Integer> {
}
