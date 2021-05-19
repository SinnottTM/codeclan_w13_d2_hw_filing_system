package com.example.codeclan.folderOrganiser.components;

import com.example.codeclan.folderOrganiser.models.File;
import com.example.codeclan.folderOrganiser.models.Folder;
import com.example.codeclan.folderOrganiser.models.User;
import com.example.codeclan.folderOrganiser.repositories.FileRepository;
import com.example.codeclan.folderOrganiser.repositories.FolderRepository;
import com.example.codeclan.folderOrganiser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Tim");
        User user2 = new User("Stu");
        User user3 = new User("Diane");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        Folder folder1 = new Folder("Memes", user1);
        Folder folder2 = new Folder("More Memes", user1);
        Folder folder3 = new Folder("CATS", user2);
        Folder folder4 = new Folder("Doggos", user3);

        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);

        File file1 = new File("Awkward Penguin", ".jpeg", 100, folder1);
        File file2 = new File("Doom", ".exe", 100, folder1);
        File file3 = new File("Nyan Cat", ".swf", 100, folder2);
        File file4 = new File("Doggo", ".png", 100, folder3);
        File file5 = new File("Your Ma", ".txt", 100, folder4);
        File file6 = new File("Filthy Frank", ".txt", 100, folder2);
        File file7 = new File("Bulbasaur", ".txt", 100, folder2);
        File file8 = new File("More of your Ma", ".txt", 100, folder1);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
        fileRepository.save(file7);
        fileRepository.save(file8);
    }



}
