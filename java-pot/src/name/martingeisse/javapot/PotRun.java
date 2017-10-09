package name.martingeisse.javapot;

import java.io.File;

/**
 *
 */
public class PotRun {

	private File potFile;
	private File outputClasspathRoot;

	public File getPotFile() {
		return potFile;
	}

	public void setPotFile(File potFile) {
		this.potFile = potFile;
	}

	public File getOutputClasspathRoot() {
		return outputClasspathRoot;
	}

	public void setOutputClasspathRoot(File outputClasspathRoot) {
		this.outputClasspathRoot = outputClasspathRoot;
	}

	public void run() {
		if (potFile == null) {
			throw new IllegalStateException("no pot file specified");
		}

	}

}
