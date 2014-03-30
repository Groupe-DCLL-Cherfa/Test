package org.tsaap.questions.impl.wiki;

public class PasDEntrer extends Exception {
	private static final long serialVersionUID = 1L;

		public PasDEntrer() {
		}
		
		/**
		* @param message
		*/
		public PasDEntrer(String message) {
		super(message);
		}
}
