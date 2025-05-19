package org.example.mohamedamineghazoui.repositories;

import org.example.mohamedamineghazoui.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
