package contracts.ckz.create

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            description("Creating user")
            name("Create user")
            request {
                method 'POST'
                url '/api/user'
                body(
                        name: $(consumer(anyNonEmptyString()), producer('John Doe')),
                        address: $(consumer(optional(regex(alphaNumeric()))), producer(null)) // This not
//                        address: $(consumer(optional(regex(alphaNumeric()))), producer('')) // This work
                )
                headers {
                    contentType(applicationJson())
                }
            }
            response {
                status 201
            }
        }
]

