package org.phone;

public class PhoneInfo {
        private void phoneName() {
		    System.out.println("phone name is realme");
	    }
        private void phoneMieiNum() {
			System.out.println("phone miei number is 9876543210");
		}
        private void Camera() {
			System.out.println("camera is 64mp");
		}
        private void storage() {
			System.out.println("storage is 128gb");
		}
        private void osName() {
			System.out.println("os name is 10 pie");
		}
        private void Ss() {
        	System.out.println("qwerty");
		}
        public static void main(String[] args) {
			PhoneInfo p = new PhoneInfo();
			p.phoneName();
			p.phoneMieiNum();
			p.Camera();
			p.storage();
			p.osName();
			p.Ss();
		}
}
