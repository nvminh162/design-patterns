// define PaymentProcess
class PaymentProcess {
  pay(amount) {
  }
}

// define VisaPaymentProcess class
class VisaPaymentProcess extends PaymentProcess {
  constructor(cardNumber, expiryDate, cvv){
    super()
    this.cardNumber = cardNumber
    this.expiryDate = expiryDate
    this.cvv = cvv
  }

  // implements the pay method
  pay(amount){
    console.log(`Paying ${amount} USD with visa card ${this.cardNumber}...`)
    // TODO: Implement logic...
  }
}

// define MomoPaymentProcess
class MomoPaymentProcess extends PaymentProcess {
  constructor(phoneNumber){
    super()
    this.phoneNumber = phoneNumber
  }

  // implements the pay method
  pay(amount){
    console.log(`Paying ${amount} VND with momo card ${this.phoneNumber}...`)
    // TODO: Implement logic...
  }
}


// define MemberRegistration
class MemberRegistration {
  constructor(paymentProcessor) {
    this.paymentProcessor = paymentProcessor
  }

  // register
  register(){
    const amount = 100; // the registration fee in USD
    this.paymentProcessor.pay(amount)
    console.log('Registered for Youtube membership!')
  }
}

// Create visa payment
const visaPaymentProcessor = new VisaPaymentProcess('1234.3456.xxx', '12/25', '123')
const membership = new MemberRegistration(visaPaymentProcessor)
membership.register()

// create momo payment
const momoPaymentProcessor = new MomoPaymentProcess('09090909090')
const membershipMomo = new MemberRegistration(momoPaymentProcessor)
membershipMomo.register()