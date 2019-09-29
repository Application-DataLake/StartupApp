import { Component } from '@angular/core';
import { ModalController, MenuController, NavController } from '@ionic/angular';
import { RegistrationPage } from '../registration/registration.page';
import { LoginPage } from '../login/login.page';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(private modalController: ModalController,
    private menu: MenuController,
    private navCtrl: NavController) {

  }

  async login() {
    const loginModal = await this.modalController.create({
      component: LoginPage
    });
    return await loginModal.present();
  }

  async register() {
    const registerModal = await this.modalController.create({
      component: RegistrationPage
    });
    return await registerModal.present();
  }

}
