package com.example.codeclan.folderOrganiser.repositories;
import com.example.codeclan.folderOrganiser.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
