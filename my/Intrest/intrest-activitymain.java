<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Simpleintrest">

    <EditText
        android:id="@+id/t1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="68dp"
        android:layout_marginEnd="101dp"
        android:layout_marginBottom="18dp"
        android:ems="10"
        android:hint="Principles of amount"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/t2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="@+id/t2"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/t2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="100dp"
        android:layout_marginTop="18dp"
        android:layout_marginEnd="101dp"
        android:layout_marginBottom="23dp"
        android:ems="10"
        android:hint="No.of.Years"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/t3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/t1" />

    <Button
        android:id="@+id/b2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="157dp"
        android:layout_marginTop="1dp"
        android:layout_marginEnd="160dp"
        android:layout_marginBottom="406dp"
        android:text="Result"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/t3" />

    <EditText
        android:id="@+id/t3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="14dp"
        android:layout_marginBottom="12dp"
        android:ems="10"
        android:hint="rate of intrest"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/b2"
        app:layout_constraintEnd_toEndOf="@+id/t2"
        app:layout_constraintStart_toStartOf="@+id/t2"
        app:layout_constraintTop_toBottomOf="@+id/t2" />

</androidx.constraintlayout.widget.ConstraintLayout>