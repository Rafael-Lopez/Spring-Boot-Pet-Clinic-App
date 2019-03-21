package com.lopez.rafael.sfgpetclinic.services;

import com.lopez.rafael.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
