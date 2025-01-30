package dean.mitco.votingApp.service;

import dean.mitco.votingApp.model.Poll;
import dean.mitco.votingApp.repository.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }

}
