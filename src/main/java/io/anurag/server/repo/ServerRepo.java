package io.anurag.server.repo;

import io.anurag.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress); //Name here is very important, every thing after 'findBy' IpAddress = select ipAddress from.. where ipAddress == ..
    // Note: Server findByName(String name); --> This would not work because name is possibly not unique
}
