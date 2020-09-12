package lt.verbus.verbuspetclinic.services;

import lt.verbus.verbuspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
